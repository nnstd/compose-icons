package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSwitch: ImageVector
    get() {
        if (_AccountSwitch != null) {
            return _AccountSwitch!!
        }
        _AccountSwitch = ImageVector.Builder(
            name = "AccountSwitch",
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
                moveTo(2f, 13f)
                curveTo(2f, 13f, 2f, 9f, 8f, 9f)
                reflectiveCurveTo(14f, 13f, 14f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
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

        return _AccountSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSwitch: ImageVector? = null
