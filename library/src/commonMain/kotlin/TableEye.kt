package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableEye: ImageVector
    get() {
        if (_TableEye != null) {
            return _TableEye!!
        }
        _TableEye = ImageVector.Builder(
            name = "TableEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16.88f)
                curveTo(17.56f, 16.88f, 18f, 17.32f, 18f, 17.88f)
                reflectiveCurveTo(17.56f, 18.88f, 17f, 18.88f)
                reflectiveCurveTo(16f, 18.43f, 16f, 17.88f)
                reflectiveCurveTo(16.44f, 16.88f, 17f, 16.88f)
                moveTo(17f, 13.88f)
                curveTo(19.73f, 13.88f, 22.06f, 15.54f, 23f, 17.88f)
                curveTo(22.06f, 20.22f, 19.73f, 21.88f, 17f, 21.88f)
                reflectiveCurveTo(11.94f, 20.22f, 11f, 17.88f)
                curveTo(11.94f, 15.54f, 14.27f, 13.88f, 17f, 13.88f)
                moveTo(17f, 15.38f)
                curveTo(15.62f, 15.38f, 14.5f, 16.5f, 14.5f, 17.88f)
                reflectiveCurveTo(15.62f, 20.38f, 17f, 20.38f)
                reflectiveCurveTo(19.5f, 19.26f, 19.5f, 17.88f)
                reflectiveCurveTo(18.38f, 15.38f, 17f, 15.38f)
                moveTo(18f, 3f)
                horizontalLineTo(4f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(17f)
                curveTo(2f, 18.1f, 2.9f, 19f, 4f, 19f)
                horizontalLineTo(9.42f)
                curveTo(9.26f, 18.68f, 9.12f, 18.34f, 9f, 18f)
                curveTo(9.12f, 17.66f, 9.26f, 17.32f, 9.42f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15.97f)
                curveTo(10.55f, 15.11f, 11.23f, 14.37f, 12f, 13.76f)
                verticalLineTo(13f)
                horizontalLineTo(13.15f)
                curveTo(14.31f, 12.36f, 15.62f, 12f, 17f, 12f)
                curveTo(18.06f, 12f, 19.07f, 12.21f, 20f, 12.59f)
                verticalLineTo(5f)
                curveTo(20f, 3.9f, 19.1f, 3f, 18f, 3f)
                moveTo(10f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                moveTo(18f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TableEye!!
    }

@Suppress("ObjectPropertyName")
private var _TableEye: ImageVector? = null
