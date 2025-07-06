package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BugPlayOutline: ImageVector
    get() {
        if (_BugPlayOutline != null) {
            return _BugPlayOutline!!
        }
        _BugPlayOutline = ImageVector.Builder(
            name = "BugPlayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(16.19f)
                curveTo(15.74f, 6.2f, 15.12f, 5.5f, 14.37f, 5f)
                lineTo(16f, 3.41f)
                lineTo(14.59f, 2f)
                lineTo(12.42f, 4.17f)
                curveTo(11.96f, 4.06f, 11.5f, 4f, 11f, 4f)
                reflectiveCurveTo(10.05f, 4.06f, 9.59f, 4.17f)
                lineTo(7.41f, 2f)
                lineTo(6f, 3.41f)
                lineTo(7.62f, 5f)
                curveTo(6.87f, 5.5f, 6.26f, 6.21f, 5.81f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(5.09f)
                curveTo(5.03f, 9.33f, 5f, 9.66f, 5f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                curveTo(5f, 14.34f, 5.03f, 14.67f, 5.09f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5.81f)
                curveTo(7.26f, 19.5f, 10.28f, 20.61f, 13f, 19.65f)
                verticalLineTo(19f)
                curveTo(13f, 18.43f, 13.09f, 17.86f, 13.25f, 17.31f)
                curveTo(12.59f, 17.76f, 11.8f, 18f, 11f, 18f)
                curveTo(8.79f, 18f, 7f, 16.21f, 7f, 14f)
                verticalLineTo(10f)
                curveTo(7f, 7.79f, 8.79f, 6f, 11f, 6f)
                reflectiveCurveTo(15f, 7.79f, 15f, 10f)
                verticalLineTo(14f)
                curveTo(15f, 14.19f, 15f, 14.39f, 14.95f, 14.58f)
                curveTo(15.54f, 14.04f, 16.24f, 13.62f, 17f, 13.35f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                curveTo(17f, 9.66f, 16.97f, 9.33f, 16.91f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(13f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(13f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(17f, 16f)
                verticalLineTo(22f)
                lineTo(22f, 19f)
                lineTo(17f, 16f)
                close()
            }
        }.build()

        return _BugPlayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BugPlayOutline: ImageVector? = null
