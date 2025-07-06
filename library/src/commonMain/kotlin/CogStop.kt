package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CogStop: ImageVector
    get() {
        if (_CogStop != null) {
            return _CogStop!!
        }
        _CogStop = ImageVector.Builder(
            name = "CogStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.53f, 22f)
                horizontalLineTo(10f)
                curveTo(9.75f, 22f, 9.54f, 21.82f, 9.5f, 21.58f)
                lineTo(9.13f, 18.93f)
                curveTo(8.5f, 18.68f, 7.96f, 18.34f, 7.44f, 17.94f)
                lineTo(4.95f, 18.95f)
                curveTo(4.73f, 19.03f, 4.46f, 18.95f, 4.34f, 18.73f)
                lineTo(2.34f, 15.27f)
                curveTo(2.21f, 15.05f, 2.27f, 14.78f, 2.46f, 14.63f)
                lineTo(4.57f, 12.97f)
                curveTo(4.53f, 12.65f, 4.5f, 12.33f, 4.5f, 12f)
                reflectiveCurveTo(4.53f, 11.34f, 4.57f, 11f)
                lineTo(2.46f, 9.37f)
                curveTo(2.27f, 9.22f, 2.21f, 8.95f, 2.34f, 8.73f)
                lineTo(4.34f, 5.27f)
                curveTo(4.46f, 5.05f, 4.73f, 4.96f, 4.95f, 5.05f)
                lineTo(7.44f, 6.05f)
                curveTo(7.96f, 5.66f, 8.5f, 5.32f, 9.13f, 5.07f)
                lineTo(9.5f, 2.42f)
                curveTo(9.54f, 2.18f, 9.75f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.25f, 2f, 14.46f, 2.18f, 14.5f, 2.42f)
                lineTo(14.87f, 5.07f)
                curveTo(15.5f, 5.32f, 16.04f, 5.66f, 16.56f, 6.05f)
                lineTo(19.05f, 5.05f)
                curveTo(19.27f, 4.96f, 19.54f, 5.05f, 19.66f, 5.27f)
                lineTo(21.66f, 8.73f)
                curveTo(21.78f, 8.95f, 21.73f, 9.22f, 21.54f, 9.37f)
                lineTo(19.43f, 11f)
                curveTo(19.47f, 11.34f, 19.5f, 11.67f, 19.5f, 12f)
                curveTo(19.5f, 12.06f, 19.5f, 12.12f, 19.5f, 12.19f)
                curveTo(19f, 12.07f, 18.5f, 12f, 18f, 12f)
                curveTo(17.08f, 12f, 16.22f, 12.21f, 15.44f, 12.58f)
                curveTo(15.47f, 12.39f, 15.5f, 12.2f, 15.5f, 12f)
                curveTo(15.5f, 10.07f, 13.93f, 8.5f, 12f, 8.5f)
                reflectiveCurveTo(8.5f, 10.07f, 8.5f, 12f)
                reflectiveCurveTo(10.07f, 15.5f, 12f, 15.5f)
                curveTo(12.2f, 15.5f, 12.39f, 15.47f, 12.58f, 15.44f)
                curveTo(12.21f, 16.22f, 12f, 17.08f, 12f, 18f)
                curveTo(12f, 19.54f, 12.58f, 20.94f, 13.53f, 22f)
                moveTo(21f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _CogStop!!
    }

@Suppress("ObjectPropertyName")
private var _CogStop: ImageVector? = null
