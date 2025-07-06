package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GarageAlert: ImageVector
    get() {
        if (_GarageAlert != null) {
            return _GarageAlert!!
        }
        _GarageAlert = ImageVector.Builder(
            name = "GarageAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                lineTo(10f, 5f)
                lineTo(17f, 9f)
                verticalLineTo(20f)
                moveTo(6f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(6f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(19f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(19f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _GarageAlert!!
    }

@Suppress("ObjectPropertyName")
private var _GarageAlert: ImageVector? = null
