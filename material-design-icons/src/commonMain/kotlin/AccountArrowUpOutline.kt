package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountArrowUpOutline: ImageVector
    get() {
        if (_AccountArrowUpOutline != null) {
            return _AccountArrowUpOutline!!
        }
        _AccountArrowUpOutline = ImageVector.Builder(
            name = "AccountArrowUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                lineTo(18f, 14f)
                lineTo(15f, 17f)
                horizontalLineTo(17f)
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
            }
        }.build()

        return _AccountArrowUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountArrowUpOutline: ImageVector? = null
