package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudPrintOutline: ImageVector
    get() {
        if (_CloudPrintOutline != null) {
            return _CloudPrintOutline!!
        }
        _CloudPrintOutline = ImageVector.Builder(
            name = "CloudPrintOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                moveTo(15f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(15f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                moveTo(23f, 13.5f)
                curveTo(23f, 14.75f, 22.56f, 15.81f, 21.69f, 16.69f)
                curveTo(20.81f, 17.56f, 19.75f, 18f, 18.5f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(17.95f)
                curveTo(4.7f, 17.85f, 3.57f, 17.36f, 2.61f, 16.43f)
                curveTo(1.54f, 15.38f, 1f, 14.09f, 1f, 12.58f)
                curveTo(1f, 11.28f, 1.39f, 10.12f, 2.17f, 9.1f)
                reflectiveCurveTo(4f, 7.43f, 5.25f, 7.15f)
                curveTo(5.67f, 5.62f, 6.5f, 4.38f, 7.75f, 3.43f)
                reflectiveCurveTo(10.42f, 2f, 12f, 2f)
                curveTo(13.95f, 2f, 15.6f, 2.68f, 16.96f, 4.04f)
                curveTo(18.32f, 5.4f, 19f, 7.05f, 19f, 9f)
                curveTo(20.15f, 9.13f, 21.1f, 9.63f, 21.86f, 10.5f)
                curveTo(22.62f, 11.35f, 23f, 12.35f, 23f, 13.5f)
                moveTo(6f, 15.95f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                curveTo(17f, 7.62f, 16.5f, 6.44f, 15.54f, 5.46f)
                curveTo(14.56f, 4.5f, 13.38f, 4f, 12f, 4f)
                reflectiveCurveTo(9.44f, 4.5f, 8.46f, 5.46f)
                curveTo(7.5f, 6.44f, 7f, 7.62f, 7f, 9f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 9f, 4.71f, 9.34f, 4.03f, 10.03f)
                curveTo(3.34f, 10.71f, 3f, 11.53f, 3f, 12.5f)
                reflectiveCurveTo(3.34f, 14.29f, 4.03f, 15f)
                curveTo(4.59f, 15.54f, 5.25f, 15.85f, 6f, 15.95f)
                moveTo(16f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                moveTo(21f, 13.5f)
                curveTo(21f, 12.8f, 20.76f, 12.21f, 20.27f, 11.73f)
                reflectiveCurveTo(19.2f, 11f, 18.5f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(18.5f)
                curveTo(19.2f, 16f, 19.79f, 15.76f, 20.27f, 15.28f)
                reflectiveCurveTo(21f, 14.2f, 21f, 13.5f)
                close()
            }
        }.build()

        return _CloudPrintOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CloudPrintOutline: ImageVector? = null
