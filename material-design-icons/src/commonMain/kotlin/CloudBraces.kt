package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudBraces: ImageVector
    get() {
        if (_CloudBraces != null) {
            return _CloudBraces!!
        }
        _CloudBraces = ImageVector.Builder(
            name = "CloudBraces",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19f, 11f)
                curveTo(19f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1f, 13.28f, 1f, 14.58f)
                curveTo(1f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5f, 20f, 6.5f, 20f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23f, 16.75f, 23f, 15.5f)
                curveTo(23f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(10.5f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                curveTo(9f, 12.11f, 8.11f, 13f, 7f, 13f)
                curveTo(8.11f, 13f, 9f, 13.9f, 9f, 15f)
                verticalLineTo(16f)
                horizontalLineTo(10.5f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                curveTo(7.9f, 18f, 7f, 17.11f, 7f, 16f)
                verticalLineTo(15f)
                curveTo(7f, 14.45f, 6.55f, 14f, 6f, 14f)
                horizontalLineTo(5.5f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                curveTo(6.55f, 12f, 7f, 11.55f, 7f, 11f)
                verticalLineTo(10f)
                curveTo(7f, 8.9f, 7.9f, 8f, 9f, 8f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                moveTo(18.5f, 14f)
                horizontalLineTo(18f)
                curveTo(17.45f, 14f, 17f, 14.45f, 17f, 15f)
                verticalLineTo(16f)
                curveTo(17f, 17.11f, 16.11f, 18f, 15f, 18f)
                horizontalLineTo(13.5f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                curveTo(15f, 13.9f, 15.9f, 13f, 17f, 13f)
                curveTo(15.9f, 13f, 15f, 12.11f, 15f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(13.5f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                curveTo(16.11f, 8f, 17f, 8.9f, 17f, 10f)
                verticalLineTo(11f)
                curveTo(17f, 11.55f, 17.45f, 12f, 18f, 12f)
                horizontalLineTo(18.5f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _CloudBraces!!
    }

@Suppress("ObjectPropertyName")
private var _CloudBraces: ImageVector? = null
