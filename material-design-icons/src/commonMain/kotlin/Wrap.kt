package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Wrap: ImageVector
    get() {
        if (_Wrap != null) {
            return _Wrap!!
        }
        _Wrap = ImageVector.Builder(
            name = "Wrap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(3f, 19f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(3f, 13f)
                horizontalLineTo(18f)
                curveTo(19f, 13f, 20f, 13.43f, 20f, 15f)
                curveTo(20f, 16.57f, 19f, 17f, 18f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                lineTo(12f, 18f)
                lineTo(16f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                curveTo(20.95f, 19f, 22f, 17.73f, 22f, 15f)
                curveTo(22f, 12.28f, 21f, 11f, 18f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Wrap!!
    }

@Suppress("ObjectPropertyName")
private var _Wrap: ImageVector? = null
