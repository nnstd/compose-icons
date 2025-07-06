package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContactlessPaymentCircleOutline: ImageVector
    get() {
        if (_ContactlessPaymentCircleOutline != null) {
            return _ContactlessPaymentCircleOutline!!
        }
        _ContactlessPaymentCircleOutline = ImageVector.Builder(
            name = "ContactlessPaymentCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.41f, 4f, 12f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(8.43f, 14.44f)
                lineTo(7.07f, 13.83f)
                curveTo(7.35f, 13.27f, 7.5f, 12.67f, 7.5f, 12.05f)
                curveTo(7.5f, 11.39f, 7.35f, 10.76f, 7.07f, 10.17f)
                lineTo(8.43f, 9.56f)
                curveTo(8.81f, 10.37f, 9f, 11.2f, 9f, 12.05f)
                curveTo(9f, 12.8f, 8.81f, 13.6f, 8.43f, 14.44f)
                moveTo(11.53f, 15.94f)
                lineTo(10.22f, 15.29f)
                curveTo(10.75f, 14.16f, 11f, 13f, 11f, 11.86f)
                curveTo(11f, 10.73f, 10.75f, 9.69f, 10.22f, 8.71f)
                lineTo(11.53f, 7.96f)
                curveTo(12.19f, 9.12f, 12.5f, 10.42f, 12.5f, 11.86f)
                curveTo(12.5f, 13.33f, 12.19f, 14.69f, 11.53f, 15.94f)
                moveTo(14.68f, 17.35f)
                lineTo(13.31f, 16.65f)
                curveTo(14.1f, 15.11f, 14.5f, 13.57f, 14.5f, 12f)
                reflectiveCurveTo(14.1f, 8.87f, 13.31f, 7.31f)
                lineTo(14.68f, 6.65f)
                curveTo(15.55f, 8.43f, 16f, 10.22f, 16f, 12f)
                curveTo(16f, 13.82f, 15.55f, 15.6f, 14.68f, 17.35f)
                close()
            }
        }.build()

        return _ContactlessPaymentCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContactlessPaymentCircleOutline: ImageVector? = null
