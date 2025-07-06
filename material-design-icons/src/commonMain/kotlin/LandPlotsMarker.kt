package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandPlotsMarker: ImageVector
    get() {
        if (_LandPlotsMarker != null) {
            return _LandPlotsMarker!!
        }
        _LandPlotsMarker = ImageVector.Builder(
            name = "LandPlotsMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(14.55f)
                curveTo(14.73f, 20.3f, 14.91f, 20.58f, 15.09f, 20.84f)
                curveTo(15.38f, 21.27f, 15.66f, 21.66f, 15.92f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                moveTo(8f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                moveTo(4f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                moveTo(10f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                moveTo(18.5f, 22f)
                curveTo(18.5f, 22f, 17.92f, 21.35f, 17.23f, 20.41f)
                curveTo(17.14f, 20.28f, 17.04f, 20.14f, 16.94f, 20f)
                curveTo(16f, 18.66f, 15f, 16.89f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                curveTo(19.03f, 12f, 19.54f, 12.13f, 20f, 12.35f)
                curveTo(21.17f, 12.92f, 22f, 14.13f, 22f, 15.5f)
                curveTo(22f, 17.04f, 20.77f, 19.04f, 19.77f, 20.41f)
                curveTo(19.08f, 21.35f, 18.5f, 22f, 18.5f, 22f)
                moveTo(17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                curveTo(19.2f, 16.8f, 19.8f, 16.2f, 19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                curveTo(17.9f, 14.4f, 17.3f, 14.9f, 17.3f, 15.6f)
                close()
            }
        }.build()

        return _LandPlotsMarker!!
    }

@Suppress("ObjectPropertyName")
private var _LandPlotsMarker: ImageVector? = null
