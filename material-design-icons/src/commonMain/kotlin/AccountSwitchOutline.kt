package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSwitchOutline: ImageVector
    get() {
        if (_AccountSwitchOutline != null) {
            return _AccountSwitchOutline!!
        }
        _AccountSwitchOutline = ImageVector.Builder(
            name = "AccountSwitchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                curveTo(22f, 9f, 22f, 13f, 22f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                curveTo(16f, 13f, 16f, 11.31f, 14.85f, 9.8f)
                curveTo(14.68f, 9.57f, 14.47f, 9.35f, 14.25f, 9.14f)
                curveTo(14.77f, 9.06f, 15.34f, 9f, 16f, 9f)
                moveTo(8f, 11f)
                curveTo(11.5f, 11f, 11.94f, 12.56f, 12f, 13f)
                horizontalLineTo(4f)
                curveTo(4.06f, 12.56f, 4.5f, 11f, 8f, 11f)
                moveTo(8f, 9f)
                curveTo(2f, 9f, 2f, 13f, 2f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                curveTo(14f, 13f, 14f, 9f, 8f, 9f)
                moveTo(9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18f, 20f)
                lineTo(15f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(23f)
                lineTo(6f, 20f)
                lineTo(9f, 17f)
                moveTo(8f, 3f)
                curveTo(8.55f, 3f, 9f, 3.45f, 9f, 4f)
                reflectiveCurveTo(8.55f, 5f, 8f, 5f)
                reflectiveCurveTo(7f, 4.55f, 7f, 4f)
                reflectiveCurveTo(7.45f, 3f, 8f, 3f)
                moveTo(8f, 1f)
                curveTo(6.34f, 1f, 5f, 2.34f, 5f, 4f)
                reflectiveCurveTo(6.34f, 7f, 8f, 7f)
                reflectiveCurveTo(11f, 5.66f, 11f, 4f)
                reflectiveCurveTo(9.66f, 1f, 8f, 1f)
                moveTo(16f, 1f)
                curveTo(14.34f, 1f, 13f, 2.34f, 13f, 4f)
                reflectiveCurveTo(14.34f, 7f, 16f, 7f)
                reflectiveCurveTo(19f, 5.66f, 19f, 4f)
                reflectiveCurveTo(17.66f, 1f, 16f, 1f)
                close()
            }
        }.build()

        return _AccountSwitchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSwitchOutline: ImageVector? = null
