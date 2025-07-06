package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageRefreshOutline: ImageVector
    get() {
        if (_ImageRefreshOutline != null) {
            return _ImageRefreshOutline!!
        }
        _ImageRefreshOutline = ImageVector.Builder(
            name = "ImageRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.68f, 13.25f)
                curveTo(13.45f, 14.15f, 12.54f, 15.47f, 12.18f, 17f)
                horizontalLineTo(6.5f)
                lineTo(9.25f, 13.47f)
                lineTo(11.21f, 15.83f)
                lineTo(13.96f, 12.29f)
                lineTo(14.68f, 13.25f)
                moveTo(5f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(12.03f)
                curveTo(19.7f, 12.09f, 20.38f, 12.24f, 21f, 12.5f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(12.5f)
                curveTo(12.24f, 20.38f, 12.09f, 19.7f, 12.03f, 19f)
                horizontalLineTo(5f)
                moveTo(22f, 18.5f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18f, 14.5f)
                curveTo(15.79f, 14.5f, 14f, 16.29f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20f)
                horizontalLineTo(20f)
                curveTo(19.54f, 20.61f, 18.82f, 21f, 18f, 21f)
                curveTo(16.62f, 21f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16f, 18f, 16f)
                curveTo(18.69f, 16f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18f, 18.5f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ImageRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageRefreshOutline: ImageVector? = null
