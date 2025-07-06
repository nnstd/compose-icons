package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Human: ImageVector
    get() {
        if (_Human != null) {
            return _Human!!
        }
        _Human = ImageVector.Builder(
            name = "Human",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                curveTo(10.89f, 6f, 10f, 5.1f, 10f, 4f)
                curveTo(10f, 2.89f, 10.89f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Human!!
    }

@Suppress("ObjectPropertyName")
private var _Human: ImageVector? = null
