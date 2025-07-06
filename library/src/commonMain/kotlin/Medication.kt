package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Medication: ImageVector
    get() {
        if (_Medication != null) {
            return _Medication!!
        }
        _Medication = ImageVector.Builder(
            name = "Medication",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                horizontalLineTo(18f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                moveTo(17f, 6f)
                horizontalLineTo(7f)
                curveTo(5.9f, 6f, 5f, 6.9f, 5f, 8f)
                verticalLineTo(19f)
                curveTo(5f, 20.1f, 5.9f, 21f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(18.1f, 21f, 19f, 20.1f, 19f, 19f)
                verticalLineTo(8f)
                curveTo(19f, 6.9f, 18.1f, 6f, 17f, 6f)
                moveTo(16f, 15f)
                horizontalLineTo(13.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Medication!!
    }

@Suppress("ObjectPropertyName")
private var _Medication: ImageVector? = null
