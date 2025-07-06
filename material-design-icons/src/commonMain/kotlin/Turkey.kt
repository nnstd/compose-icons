package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Turkey: ImageVector
    get() {
        if (_Turkey != null) {
            return _Turkey!!
        }
        _Turkey = ImageVector.Builder(
            name = "Turkey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 19.44f)
                curveTo(9.75f, 19.8f, 8.9f, 20f, 8f, 20f)
                curveTo(4.69f, 20f, 2f, 17.31f, 2f, 14f)
                verticalLineTo(9f)
                curveTo(2f, 5.69f, 4.69f, 3f, 8f, 3f)
                lineTo(10.5f, 7.58f)
                curveTo(8.1f, 8.81f, 6.5f, 11f, 6.5f, 13.5f)
                curveTo(6.5f, 16f, 8.11f, 18.2f, 10.5f, 19.44f)
                moveTo(16f, 18.94f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                curveTo(17.55f, 20f, 18f, 20.45f, 18f, 21f)
                reflectiveCurveTo(17.55f, 22f, 17f, 22f)
                horizontalLineTo(14f)
                curveTo(13.45f, 22f, 13f, 21.55f, 13f, 21f)
                reflectiveCurveTo(13.45f, 20f, 14f, 20f)
                verticalLineTo(18.94f)
                curveTo(10.61f, 18.56f, 8f, 16.27f, 8f, 13.5f)
                curveTo(8f, 10.46f, 11.13f, 8f, 15f, 8f)
                curveTo(15.19f, 8f, 15.37f, 8f, 15.56f, 8f)
                curveTo(14.84f, 6.63f, 14f, 5.23f, 14f, 4f)
                curveTo(14f, 2.9f, 14.9f, 2f, 16f, 2f)
                curveTo(18.21f, 2f, 20f, 3.79f, 20f, 6f)
                horizontalLineTo(18f)
                curveTo(18f, 6f, 22f, 9f, 22f, 13.5f)
                curveTo(22f, 16.27f, 19.39f, 18.56f, 16f, 18.94f)
                moveTo(16f, 4f)
                curveTo(16f, 4.55f, 16.45f, 5f, 17f, 5f)
                reflectiveCurveTo(18f, 4.55f, 18f, 4f)
                reflectiveCurveTo(17.55f, 3f, 17f, 3f)
                reflectiveCurveTo(16f, 3.45f, 16f, 4f)
                moveTo(17f, 12f)
                curveTo(17f, 10.9f, 16.11f, 10f, 15f, 10f)
                curveTo(12.79f, 10f, 11f, 11.79f, 11f, 14f)
                horizontalLineTo(15f)
                curveTo(16.11f, 14f, 17f, 13.11f, 17f, 12f)
                close()
            }
        }.build()

        return _Turkey!!
    }

@Suppress("ObjectPropertyName")
private var _Turkey: ImageVector? = null
