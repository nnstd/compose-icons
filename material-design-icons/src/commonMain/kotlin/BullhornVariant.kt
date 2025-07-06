package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BullhornVariant: ImageVector
    get() {
        if (_BullhornVariant != null) {
            return _BullhornVariant!!
        }
        _BullhornVariant = ImageVector.Builder(
            name = "BullhornVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                verticalLineTo(4f)
                lineTo(4f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                lineTo(6f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(6f, 20.4f, 7.6f, 22f, 9.5f, 22f)
                reflectiveCurveTo(13f, 20.4f, 13f, 18.5f)
                verticalLineTo(18.3f)
                lineTo(20f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                moveTo(11f, 18.5f)
                curveTo(11f, 19.3f, 10.3f, 20f, 9.5f, 20f)
                reflectiveCurveTo(8f, 19.3f, 8f, 18.5f)
                verticalLineTo(17f)
                lineTo(11f, 17.8f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _BullhornVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BullhornVariant: ImageVector? = null
