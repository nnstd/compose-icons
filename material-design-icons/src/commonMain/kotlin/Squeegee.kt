package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Squeegee: ImageVector
    get() {
        if (_Squeegee != null) {
            return _Squeegee!!
        }
        _Squeegee = ImageVector.Builder(
            name = "Squeegee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                moveTo(2f, 8f)
                horizontalLineTo(7f)
                lineTo(9f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                lineTo(17f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _Squeegee!!
    }

@Suppress("ObjectPropertyName")
private var _Squeegee: ImageVector? = null
