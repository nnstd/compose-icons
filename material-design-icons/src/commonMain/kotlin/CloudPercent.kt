package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CloudPercent: ImageVector
    get() {
        if (_CloudPercent != null) {
            return _CloudPercent!!
        }
        _CloudPercent = ImageVector.Builder(
            name = "CloudPercent",
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
                moveTo(9.45f, 9.03f)
                curveTo(10.23f, 9.03f, 10.87f, 9.67f, 10.87f, 10.45f)
                curveTo(10.87f, 11.23f, 10.23f, 11.87f, 9.45f, 11.87f)
                curveTo(8.67f, 11.87f, 8.03f, 11.23f, 8.03f, 10.45f)
                curveTo(8.03f, 9.67f, 8.67f, 9.03f, 9.45f, 9.03f)
                moveTo(14.55f, 16.97f)
                curveTo(13.77f, 16.97f, 13.13f, 16.33f, 13.13f, 15.55f)
                curveTo(13.13f, 14.77f, 13.77f, 14.13f, 14.55f, 14.13f)
                curveTo(15.33f, 14.13f, 15.97f, 14.77f, 15.97f, 15.55f)
                curveTo(15.97f, 16.33f, 15.33f, 16.97f, 14.55f, 16.97f)
                moveTo(9.2f, 17f)
                lineTo(8f, 15.8f)
                lineTo(14.8f, 9f)
                lineTo(16f, 10.2f)
                lineTo(9.2f, 17f)
                close()
            }
        }.build()

        return _CloudPercent!!
    }

@Suppress("ObjectPropertyName")
private var _CloudPercent: ImageVector? = null
