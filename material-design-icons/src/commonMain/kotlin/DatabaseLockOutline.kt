package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseLockOutline: ImageVector
    get() {
        if (_DatabaseLockOutline != null) {
            return _DatabaseLockOutline!!
        }
        _DatabaseLockOutline = ImageVector.Builder(
            name = "DatabaseLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(11.05f)
                curveTo(18.17f, 11.03f, 18.33f, 11f, 18.5f, 11f)
                curveTo(19.03f, 11f, 19.53f, 11.1f, 20f, 11.26f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(12.34f, 21f, 12.67f, 21f, 13f, 20.97f)
                verticalLineTo(18.95f)
                curveTo(12.68f, 19f, 12.35f, 19f, 12f, 19f)
                curveTo(8.13f, 19f, 6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                curveTo(12.41f, 16f, 12.81f, 15.97f, 13.21f, 15.94f)
                curveTo(13.4f, 15.46f, 13.68f, 15.03f, 14.07f, 14.7f)
                curveTo(14.13f, 14.39f, 14.23f, 14.09f, 14.34f, 13.8f)
                curveTo(13.6f, 13.93f, 12.81f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                moveTo(12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                moveTo(21f, 16f)
                verticalLineTo(15.5f)
                curveTo(21f, 14.12f, 19.88f, 13f, 18.5f, 13f)
                reflectiveCurveTo(16f, 14.12f, 16f, 15.5f)
                verticalLineTo(16f)
                curveTo(15.45f, 16f, 15f, 16.45f, 15f, 17f)
                verticalLineTo(21f)
                curveTo(15f, 21.55f, 15.45f, 22f, 16f, 22f)
                horizontalLineTo(21f)
                curveTo(21.55f, 22f, 22f, 21.55f, 22f, 21f)
                verticalLineTo(17f)
                curveTo(22f, 16.45f, 21.55f, 16f, 21f, 16f)
                moveTo(20f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(15.5f)
                curveTo(17f, 14.67f, 17.67f, 14f, 18.5f, 14f)
                reflectiveCurveTo(20f, 14.67f, 20f, 15.5f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _DatabaseLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseLockOutline: ImageVector? = null
