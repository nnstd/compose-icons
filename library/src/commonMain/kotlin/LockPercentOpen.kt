package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockPercentOpen: ImageVector
    get() {
        if (_LockPercentOpen != null) {
            return _LockPercentOpen!!
        }
        _LockPercentOpen = ImageVector.Builder(
            name = "LockPercentOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                curveTo(17f, 3.2f, 14.8f, 1f, 12f, 1f)
                reflectiveCurveTo(7f, 3.2f, 7f, 6f)
                horizontalLineTo(9f)
                curveTo(9f, 4.3f, 10.3f, 3f, 12f, 3f)
                reflectiveCurveTo(15f, 4.3f, 15f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                curveTo(4.9f, 8f, 4f, 8.9f, 4f, 10f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.1f, 22f, 20f, 21.1f, 20f, 20f)
                verticalLineTo(10f)
                curveTo(20f, 8.9f, 19.1f, 8f, 18f, 8f)
                moveTo(9.5f, 11f)
                curveTo(10.3f, 11f, 11f, 11.7f, 11f, 12.5f)
                reflectiveCurveTo(10.3f, 14f, 9.5f, 14f)
                reflectiveCurveTo(8f, 13.3f, 8f, 12.5f)
                reflectiveCurveTo(8.7f, 11f, 9.5f, 11f)
                moveTo(14.5f, 19f)
                curveTo(13.7f, 19f, 13f, 18.3f, 13f, 17.5f)
                reflectiveCurveTo(13.7f, 16f, 14.5f, 16f)
                reflectiveCurveTo(16f, 16.7f, 16f, 17.5f)
                reflectiveCurveTo(15.3f, 19f, 14.5f, 19f)
                moveTo(9.2f, 19.2f)
                lineTo(7.8f, 17.8f)
                lineTo(14.9f, 10.7f)
                lineTo(16.3f, 12.1f)
                lineTo(9.2f, 19.2f)
                close()
            }
        }.build()

        return _LockPercentOpen!!
    }

@Suppress("ObjectPropertyName")
private var _LockPercentOpen: ImageVector? = null
