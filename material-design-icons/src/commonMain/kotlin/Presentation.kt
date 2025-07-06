package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Presentation: ImageVector
    get() {
        if (_Presentation != null) {
            return _Presentation!!
        }
        _Presentation = ImageVector.Builder(
            name = "Presentation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(15.25f)
                lineTo(17f, 22f)
                horizontalLineTo(15f)
                lineTo(13.25f, 16f)
                horizontalLineTo(10.75f)
                lineTo(9f, 22f)
                horizontalLineTo(7f)
                lineTo(8.75f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                moveTo(5f, 5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Presentation!!
    }

@Suppress("ObjectPropertyName")
private var _Presentation: ImageVector? = null
