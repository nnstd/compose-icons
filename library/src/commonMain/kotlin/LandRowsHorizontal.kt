package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandRowsHorizontal: ImageVector
    get() {
        if (_LandRowsHorizontal != null) {
            return _LandRowsHorizontal!!
        }
        _LandRowsHorizontal = ImageVector.Builder(
            name = "LandRowsHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                moveTo(4f, 6.5f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6.5f)
                horizontalLineTo(4f)
                moveTo(4f, 11f)
                verticalLineTo(8.5f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                moveTo(4f, 15.5f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(15.5f)
                horizontalLineTo(4f)
                moveTo(4f, 20f)
                verticalLineTo(17.5f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _LandRowsHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _LandRowsHorizontal: ImageVector? = null
