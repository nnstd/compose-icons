package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampTorchiereVariantOutline: ImageVector
    get() {
        if (_FloorLampTorchiereVariantOutline != null) {
            return _FloorLampTorchiereVariantOutline!!
        }
        _FloorLampTorchiereVariantOutline = ImageVector.Builder(
            name = "FloorLampTorchiereVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.97f, 4f)
                lineTo(12.68f, 7f)
                horizontalLineTo(11.32f)
                lineTo(10.03f, 4f)
                horizontalLineTo(13.97f)
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                lineTo(10f, 9f)
                horizontalLineTo(14f)
                lineTo(17f, 2f)
                moveTo(15.92f, 22f)
                lineTo(13f, 15f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                lineTo(8.08f, 22f)
                horizontalLineTo(5.92f)
                lineTo(10.92f, 10f)
                horizontalLineTo(13.08f)
                lineTo(18.08f, 22f)
                horizontalLineTo(15.92f)
                close()
            }
        }.build()

        return _FloorLampTorchiereVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampTorchiereVariantOutline: ImageVector? = null
