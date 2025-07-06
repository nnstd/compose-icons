package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReplyCircle: ImageVector
    get() {
        if (_ReplyCircle != null) {
            return _ReplyCircle!!
        }
        _ReplyCircle = ImageVector.Builder(
            name = "ReplyCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.5f, 2f, 12f)
                moveTo(5f, 11f)
                lineTo(10f, 6f)
                verticalLineTo(9f)
                curveTo(15.06f, 9.73f, 17.28f, 13.33f, 18f, 17f)
                curveTo(16.19f, 14.43f, 13.61f, 13f, 10f, 13f)
                verticalLineTo(16f)
                lineTo(5f, 11f)
                close()
            }
        }.build()

        return _ReplyCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ReplyCircle: ImageVector? = null
