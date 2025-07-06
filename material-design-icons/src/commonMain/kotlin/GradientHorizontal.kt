package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GradientHorizontal: ImageVector
    get() {
        if (_GradientHorizontal != null) {
            return _GradientHorizontal!!
        }
        _GradientHorizontal = ImageVector.Builder(
            name = "GradientHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(11f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(11f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(9f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(9f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                moveTo(3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                moveTo(18f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                moveTo(18f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(18f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                moveTo(11f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _GradientHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _GradientHorizontal: ImageVector? = null
