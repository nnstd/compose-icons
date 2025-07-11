package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudArrowDownOutline: ImageVector
    get() {
        if (_CloudArrowDownOutline != null) {
            return _CloudArrowDownOutline!!
        }
        _CloudArrowDownOutline = ImageVector.Builder(
            name = "CloudArrowDownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.03f, 12.03f)
                curveTo(3.34f, 12.71f, 3f, 13.53f, 3f, 14.5f)
                reflectiveCurveTo(3.34f, 16.29f, 4.03f, 17f)
                curveTo(4.71f, 17.66f, 5.53f, 18f, 6.5f, 18f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13f, 18.66f, 13f, 19f)
                curveTo(13f, 19.34f, 13.04f, 19.67f, 13.09f, 20f)
                horizontalLineTo(6.5f)
                curveTo(5f, 20f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1f, 16.09f, 1f, 14.58f)
                curveTo(1f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4f, 12f, 4f)
                curveTo(13.95f, 4f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.4f, 19f, 9.05f, 19f, 11f)
                curveTo(20.15f, 11.13f, 21.1f, 11.63f, 21.86f, 12.5f)
                curveTo(22.37f, 13.07f, 22.7f, 13.71f, 22.86f, 14.42f)
                curveTo(21.82f, 13.54f, 20.5f, 13f, 19f, 13f)
                curveTo(18.89f, 13f, 18.79f, 13f, 18.68f, 13f)
                curveTo(18.62f, 13f, 18.56f, 13f, 18.5f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                curveTo(17f, 9.62f, 16.5f, 8.44f, 15.54f, 7.46f)
                curveTo(14.56f, 6.5f, 13.38f, 6f, 12f, 6f)
                reflectiveCurveTo(9.44f, 6.5f, 8.46f, 7.46f)
                curveTo(7.5f, 8.44f, 7f, 9.62f, 7f, 11f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 11f, 4.71f, 11.34f, 4.03f, 12.03f)
                moveTo(20f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                lineTo(19f, 23f)
                lineTo(22f, 20f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _CloudArrowDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowDownOutline: ImageVector? = null
