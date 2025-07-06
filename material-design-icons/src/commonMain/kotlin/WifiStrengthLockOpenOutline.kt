package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrengthLockOpenOutline: ImageVector
    get() {
        if (_WifiStrengthLockOpenOutline != null) {
            return _WifiStrengthLockOpenOutline!!
        }
        _WifiStrengthLockOpenOutline = ImageVector.Builder(
            name = "WifiStrengthLockOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.65f, 7f)
                horizontalLineTo(23.64f)
                curveTo(22.92f, 7.9f, 22.2f, 8.79f, 21.5f, 9.69f)
                curveTo(20.87f, 9.33f, 20.17f, 9.11f, 19.43f, 9.04f)
                lineTo(20.71f, 7.45f)
                curveTo(18.09f, 5.86f, 15.07f, 5f, 12f, 5f)
                curveTo(8.91f, 5f, 5.9f, 5.85f, 3.27f, 7.44f)
                lineTo(12f, 18.3f)
                lineTo(13f, 17f)
                curveTo(13f, 17.08f, 13f, 17.14f, 13f, 17.2f)
                verticalLineTo(20.25f)
                lineTo(12f, 21.5f)
                curveTo(8.13f, 16.66f, 4.24f, 11.83f, 0.355f, 7f)
                horizontalLineTo(0.375f)
                curveTo(3.7f, 4.41f, 7.79f, 3f, 12f, 3f)
                curveTo(16.22f, 3f, 20.32f, 4.41f, 23.65f, 7f)
                moveTo(21.8f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11f, 19f, 11f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                close()
            }
        }.build()

        return _WifiStrengthLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrengthLockOpenOutline: ImageVector? = null
