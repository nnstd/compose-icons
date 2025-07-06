package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MedicationOutline: ImageVector
    get() {
        if (_MedicationOutline != null) {
            return _MedicationOutline!!
        }
        _MedicationOutline = ImageVector.Builder(
            name = "MedicationOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(13.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15f)
                moveTo(19f, 8f)
                verticalLineTo(19f)
                curveTo(19f, 20.1f, 18.1f, 21f, 17f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.1f, 5f, 19f)
                verticalLineTo(8f)
                curveTo(5f, 6.9f, 5.9f, 6f, 7f, 6f)
                horizontalLineTo(17f)
                curveTo(18.1f, 6f, 19f, 6.9f, 19f, 8f)
                moveTo(17f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                moveTo(18f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
            }
        }.build()

        return _MedicationOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MedicationOutline: ImageVector? = null
