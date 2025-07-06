package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStrength2LockOpen: ImageVector
    get() {
        if (_WifiStrength2LockOpen != null) {
            return _WifiStrength2LockOpen!!
        }
        _WifiStrength2LockOpen = ImageVector.Builder(
            name = "WifiStrength2LockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.44f, 10.55f)
                curveTo(14.68f, 11.35f, 14.2f, 12.38f, 14.2f, 13.5f)
                verticalLineTo(14.74f)
                curveTo(13.5f, 15.34f, 13f, 16.24f, 13f, 17.2f)
                verticalLineTo(20.24f)
                lineTo(12f, 21.5f)
                curveTo(7.88f, 16.37f, 4.39f, 12.06f, 0.365f, 7f)
                curveTo(3.69f, 4.41f, 7.78f, 3f, 12f, 3f)
                curveTo(16.2f, 3f, 20.31f, 4.41f, 23.64f, 7f)
                lineTo(21.5f, 9.69f)
                curveTo(20.86f, 9.33f, 20.16f, 9.1f, 19.41f, 9.04f)
                lineTo(20.7f, 7.45f)
                curveTo(18.08f, 5.86f, 15.06f, 5f, 12f, 5f)
                reflectiveCurveTo(5.9f, 5.85f, 3.26f, 7.44f)
                lineTo(6.5f, 11.43f)
                curveTo(7.73f, 10.75f, 9.61f, 10f, 12f, 10f)
                curveTo(13.29f, 10f, 14.45f, 10.23f, 15.44f, 10.55f)
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

        return _WifiStrength2LockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStrength2LockOpen: ImageVector? = null
