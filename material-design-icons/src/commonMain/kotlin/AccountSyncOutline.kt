package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSyncOutline: ImageVector
    get() {
        if (_AccountSyncOutline != null) {
            return _AccountSyncOutline!!
        }
        _AccountSyncOutline = ImageVector.Builder(
            name = "AccountSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                curveTo(8.8f, 4f, 7f, 5.8f, 7f, 8f)
                reflectiveCurveTo(8.8f, 12f, 11f, 12f)
                reflectiveCurveTo(15f, 10.2f, 15f, 8f)
                reflectiveCurveTo(13.2f, 4f, 11f, 4f)
                moveTo(11f, 6f)
                curveTo(12.1f, 6f, 13f, 6.9f, 13f, 8f)
                reflectiveCurveTo(12.1f, 10f, 11f, 10f)
                reflectiveCurveTo(9f, 9.1f, 9f, 8f)
                reflectiveCurveTo(9.9f, 6f, 11f, 6f)
                moveTo(11f, 13f)
                curveTo(8.3f, 13f, 3f, 14.3f, 3f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(12.5f)
                curveTo(12.2f, 19.4f, 12.1f, 18.8f, 12f, 18.1f)
                horizontalLineTo(4.9f)
                verticalLineTo(17f)
                curveTo(4.9f, 16.4f, 8f, 14.9f, 11f, 14.9f)
                curveTo(11.5f, 14.9f, 12f, 15f, 12.5f, 15f)
                curveTo(12.8f, 14.4f, 13.1f, 13.8f, 13.6f, 13.3f)
                curveTo(12.6f, 13.1f, 11.7f, 13f, 11f, 13f)
                moveTo(18f, 20f)
                curveTo(16.6f, 20f, 15.5f, 18.9f, 15.5f, 17.5f)
                curveTo(15.5f, 17.1f, 15.6f, 16.7f, 15.8f, 16.4f)
                lineTo(14.7f, 15.3f)
                curveTo(14.3f, 15.9f, 14f, 16.7f, 14f, 17.5f)
                curveTo(14f, 19.7f, 15.8f, 21.5f, 18f, 21.5f)
                verticalLineTo(23f)
                lineTo(20.2f, 20.8f)
                lineTo(18f, 18.5f)
                verticalLineTo(20f)
                moveTo(18f, 13.5f)
                verticalLineTo(12f)
                lineTo(15.8f, 14.2f)
                lineTo(18f, 16.4f)
                verticalLineTo(15f)
                curveTo(19.4f, 15f, 20.5f, 16.1f, 20.5f, 17.5f)
                curveTo(20.5f, 17.9f, 20.4f, 18.3f, 20.2f, 18.6f)
                lineTo(21.3f, 19.7f)
                curveTo(21.7f, 19.1f, 22f, 18.3f, 22f, 17.5f)
                curveTo(22f, 15.3f, 20.2f, 13.5f, 18f, 13.5f)
                close()
            }
        }.build()

        return _AccountSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSyncOutline: ImageVector? = null
