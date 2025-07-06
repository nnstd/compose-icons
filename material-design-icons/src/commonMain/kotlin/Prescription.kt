package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Prescription: ImageVector
    get() {
        if (_Prescription != null) {
            return _Prescription!!
        }
        _Prescription = ImageVector.Builder(
            name = "Prescription",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                verticalLineTo(10f)
                lineTo(4f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                lineTo(13.41f, 15.41f)
                lineTo(9.83f, 19f)
                lineTo(11.24f, 20.41f)
                lineTo(14.83f, 16.83f)
                lineTo(18.41f, 20.41f)
                lineTo(19.82f, 19f)
                lineTo(16.24f, 15.41f)
                lineTo(19.82f, 11.83f)
                lineTo(18.41f, 10.41f)
                lineTo(14.83f, 14f)
                lineTo(10.83f, 10f)
                horizontalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                horizontalLineTo(4f)
                moveTo(6f, 6f)
                horizontalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Prescription!!
    }

@Suppress("ObjectPropertyName")
private var _Prescription: ImageVector? = null
