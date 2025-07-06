package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandRowsVertical: ImageVector
    get() {
        if (_LandRowsVertical != null) {
            return _LandRowsVertical!!
        }
        _LandRowsVertical = ImageVector.Builder(
            name = "LandRowsVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(6.5f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(6.5f)
                verticalLineTo(20f)
                moveTo(11f, 20f)
                horizontalLineTo(8.5f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                moveTo(15.5f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(15.5f)
                verticalLineTo(20f)
                moveTo(20f, 20f)
                horizontalLineTo(17.5f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _LandRowsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _LandRowsVertical: ImageVector? = null
