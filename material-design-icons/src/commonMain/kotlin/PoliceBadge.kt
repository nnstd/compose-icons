package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PoliceBadge: ImageVector
    get() {
        if (_PoliceBadge != null) {
            return _PoliceBadge!!
        }
        _PoliceBadge = ImageVector.Builder(
            name = "PoliceBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                lineTo(20f, 2f)
                curveTo(18.85f, 2.64f, 17.4f, 3f, 16f, 3f)
                curveTo(14.6f, 3f, 13.14f, 2.63f, 12f, 2f)
                curveTo(10.86f, 2.63f, 9.4f, 3f, 8f, 3f)
                curveTo(6.6f, 3f, 5.15f, 2.64f, 4f, 2f)
                lineTo(2f, 4f)
                curveTo(2f, 4f, 4f, 6f, 4f, 8f)
                reflectiveCurveTo(2f, 14f, 2f, 16f)
                curveTo(2f, 20f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 20f, 22f, 16f)
                curveTo(22f, 14f, 20f, 10f, 20f, 8f)
                reflectiveCurveTo(22f, 4f, 22f, 4f)
                moveTo(15.05f, 16.45f)
                lineTo(11.97f, 14.59f)
                lineTo(8.9f, 16.45f)
                lineTo(9.72f, 12.95f)
                lineTo(7f, 10.61f)
                lineTo(10.58f, 10.3f)
                lineTo(11.97f, 7f)
                lineTo(13.37f, 10.29f)
                lineTo(16.95f, 10.6f)
                lineTo(14.23f, 12.94f)
                lineTo(15.05f, 16.45f)
                close()
            }
        }.build()

        return _PoliceBadge!!
    }

@Suppress("ObjectPropertyName")
private var _PoliceBadge: ImageVector? = null
