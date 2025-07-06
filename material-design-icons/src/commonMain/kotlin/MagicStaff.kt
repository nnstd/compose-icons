package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagicStaff: ImageVector
    get() {
        if (_MagicStaff != null) {
            return _MagicStaff!!
        }
        _MagicStaff = ImageVector.Builder(
            name = "MagicStaff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 9f)
                curveTo(16.12f, 9f, 15f, 7.88f, 15f, 6.5f)
                reflectiveCurveTo(16.12f, 4f, 17.5f, 4f)
                reflectiveCurveTo(20f, 5.12f, 20f, 6.5f)
                reflectiveCurveTo(18.88f, 9f, 17.5f, 9f)
                moveTo(14.43f, 8.15f)
                lineTo(2f, 20.59f)
                lineTo(3.41f, 22f)
                lineTo(15.85f, 9.57f)
                curveTo(15.25f, 9.24f, 14.76f, 8.75f, 14.43f, 8.15f)
                moveTo(13f, 5f)
                lineTo(13.63f, 3.63f)
                lineTo(15f, 3f)
                lineTo(13.63f, 2.37f)
                lineTo(13f, 1f)
                lineTo(12.38f, 2.37f)
                lineTo(11f, 3f)
                lineTo(12.38f, 3.63f)
                lineTo(13f, 5f)
                moveTo(21f, 5f)
                lineTo(21.63f, 3.63f)
                lineTo(23f, 3f)
                lineTo(21.63f, 2.37f)
                lineTo(21f, 1f)
                lineTo(20.38f, 2.37f)
                lineTo(19f, 3f)
                lineTo(20.38f, 3.63f)
                lineTo(21f, 5f)
                moveTo(21f, 9f)
                lineTo(20.38f, 10.37f)
                lineTo(19f, 11f)
                lineTo(20.38f, 11.63f)
                lineTo(21f, 13f)
                lineTo(21.63f, 11.63f)
                lineTo(23f, 11f)
                lineTo(21.63f, 10.37f)
                lineTo(21f, 9f)
                close()
            }
        }.build()

        return _MagicStaff!!
    }

@Suppress("ObjectPropertyName")
private var _MagicStaff: ImageVector? = null
