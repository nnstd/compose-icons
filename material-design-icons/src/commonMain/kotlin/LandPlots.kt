package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandPlots: ImageVector
    get() {
        if (_LandPlots != null) {
            return _LandPlots!!
        }
        _LandPlots = ImageVector.Builder(
            name = "LandPlots",
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
                moveTo(4f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(4f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                moveTo(20f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(20f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _LandPlots!!
    }

@Suppress("ObjectPropertyName")
private var _LandPlots: ImageVector? = null
