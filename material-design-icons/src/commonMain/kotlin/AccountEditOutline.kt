package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountEditOutline: ImageVector
    get() {
        if (_AccountEditOutline != null) {
            return _AccountEditOutline!!
        }
        _AccountEditOutline = ImageVector.Builder(
            name = "AccountEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18.11f)
                horizontalLineTo(3.9f)
                verticalLineTo(17f)
                curveTo(3.9f, 16.36f, 7.03f, 14.9f, 10f, 14.9f)
                curveTo(10.96f, 14.91f, 11.91f, 15.04f, 12.83f, 15.28f)
                lineTo(14.35f, 13.76f)
                curveTo(12.95f, 13.29f, 11.5f, 13.03f, 10f, 13f)
                curveTo(7.33f, 13f, 2f, 14.33f, 2f, 17f)
                moveTo(10f, 4f)
                curveTo(7.79f, 4f, 6f, 5.79f, 6f, 8f)
                reflectiveCurveTo(7.79f, 12f, 10f, 12f)
                reflectiveCurveTo(14f, 10.21f, 14f, 8f)
                reflectiveCurveTo(12.21f, 4f, 10f, 4f)
                moveTo(10f, 10f)
                curveTo(8.9f, 10f, 8f, 9.11f, 8f, 8f)
                reflectiveCurveTo(8.9f, 6f, 10f, 6f)
                reflectiveCurveTo(12f, 6.9f, 12f, 8f)
                reflectiveCurveTo(11.11f, 10f, 10f, 10f)
                moveTo(21.7f, 13.35f)
                lineTo(20.7f, 14.35f)
                lineTo(18.65f, 12.35f)
                lineTo(19.65f, 11.35f)
                curveTo(19.86f, 11.14f, 20.21f, 11.14f, 20.42f, 11.35f)
                lineTo(21.7f, 12.63f)
                curveTo(21.91f, 12.84f, 21.91f, 13.19f, 21.7f, 13.4f)
                moveTo(12f, 18.94f)
                lineTo(18.06f, 12.88f)
                lineTo(20.11f, 14.88f)
                lineTo(14.11f, 20.95f)
                horizontalLineTo(12f)
                verticalLineTo(18.94f)
            }
        }.build()

        return _AccountEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountEditOutline: ImageVector? = null
