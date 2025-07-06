package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GarageOpenVariant: ImageVector
    get() {
        if (_GarageOpenVariant != null) {
            return _GarageOpenVariant!!
        }
        _GarageOpenVariant = ImageVector.Builder(
            name = "GarageOpenVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                lineTo(12f, 5f)
                lineTo(22f, 9f)
                moveTo(19f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _GarageOpenVariant!!
    }

@Suppress("ObjectPropertyName")
private var _GarageOpenVariant: ImageVector? = null
