package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashSync: ImageVector
    get() {
        if (_CashSync != null) {
            return _CashSync!!
        }
        _CashSync = ImageVector.Builder(
            name = "CashSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(13.32f)
                curveTo(13.1f, 17.33f, 13f, 16.66f, 13f, 16f)
                horizontalLineTo(7f)
                curveTo(7f, 14.9f, 6.11f, 14f, 5f, 14f)
                verticalLineTo(10f)
                curveTo(6.11f, 10f, 7f, 9.11f, 7f, 8f)
                horizontalLineTo(17f)
                curveTo(17f, 9.11f, 17.9f, 10f, 19f, 10f)
                verticalLineTo(10.06f)
                curveTo(19.67f, 10.06f, 20.34f, 10.18f, 21f, 10.4f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                moveTo(12f, 9f)
                curveTo(10.3f, 9.03f, 9f, 10.3f, 9f, 12f)
                reflectiveCurveTo(10.3f, 14.94f, 12f, 15f)
                curveTo(12.38f, 15f, 12.77f, 14.92f, 13.14f, 14.77f)
                curveTo(13.41f, 13.67f, 13.86f, 12.63f, 14.97f, 11.61f)
                curveTo(14.85f, 10.28f, 13.59f, 8.97f, 12f, 9f)
                moveTo(19f, 11f)
                lineTo(21.25f, 13.25f)
                lineTo(19f, 15.5f)
                verticalLineTo(14f)
                curveTo(17.15f, 14f, 15.94f, 15.96f, 16.76f, 17.62f)
                lineTo(15.67f, 18.71f)
                curveTo(13.91f, 16.05f, 15.81f, 12.5f, 19f, 12.5f)
                verticalLineTo(11f)
                moveTo(19f, 22f)
                lineTo(16.75f, 19.75f)
                lineTo(19f, 17.5f)
                verticalLineTo(19f)
                curveTo(20.85f, 19f, 22.06f, 17.04f, 21.24f, 15.38f)
                lineTo(22.33f, 14.29f)
                curveTo(24.09f, 16.95f, 22.19f, 20.5f, 19f, 20.5f)
                verticalLineTo(22f)
            }
        }.build()

        return _CashSync!!
    }

@Suppress("ObjectPropertyName")
private var _CashSync: ImageVector? = null
