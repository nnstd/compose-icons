package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckCircleOutline: ImageVector
    get() {
        if (_CheckCircleOutline != null) {
            return _CheckCircleOutline!!
        }
        _CheckCircleOutline = ImageVector.Builder(
            name = "CheckCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                reflectiveCurveTo(20f, 7.59f, 20f, 12f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                moveTo(16.59f, 7.58f)
                lineTo(10f, 14.17f)
                lineTo(7.41f, 11.59f)
                lineTo(6f, 13f)
                lineTo(10f, 17f)
                lineTo(18f, 9f)
                lineTo(16.59f, 7.58f)
                close()
            }
        }.build()

        return _CheckCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckCircleOutline: ImageVector? = null
