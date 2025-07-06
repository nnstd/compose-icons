package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RollerSkate: ImageVector
    get() {
        if (_RollerSkate != null) {
            return _RollerSkate!!
        }
        _RollerSkate = ImageVector.Builder(
            name = "RollerSkate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 18f)
                curveTo(5.1f, 18f, 4f, 19.12f, 4f, 20.5f)
                reflectiveCurveTo(5.1f, 23f, 6.5f, 23f)
                reflectiveCurveTo(9f, 21.88f, 9f, 20.5f)
                reflectiveCurveTo(7.86f, 18f, 6.5f, 18f)
                moveTo(16.5f, 18f)
                curveTo(15.1f, 18f, 14f, 19.12f, 14f, 20.5f)
                reflectiveCurveTo(15.1f, 23f, 16.5f, 23f)
                reflectiveCurveTo(19f, 21.88f, 19f, 20.5f)
                reflectiveCurveTo(17.86f, 18f, 16.5f, 18f)
                moveTo(20f, 17f)
                curveTo(20f, 15.63f, 20.09f, 13.81f, 19.5f, 12.95f)
                curveTo(18.55f, 10.9f, 15.82f, 10.56f, 13.91f, 10.05f)
                curveTo(13f, 10f, 12f, 9f, 11.82f, 8f)
                horizontalLineTo(9f)
                curveTo(8.71f, 8f, 8.5f, 7.78f, 8.5f, 7.5f)
                curveTo(8.5f, 7.22f, 8.71f, 7f, 9f, 7f)
                horizontalLineTo(11.5f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                curveTo(8.71f, 6f, 8.5f, 5.78f, 8.5f, 5.5f)
                curveTo(8.5f, 5.22f, 8.71f, 5f, 9f, 5f)
                horizontalLineTo(11.5f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _RollerSkate!!
    }

@Suppress("ObjectPropertyName")
private var _RollerSkate: ImageVector? = null
