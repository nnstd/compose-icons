package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LampsOutline: ImageVector
    get() {
        if (_LampsOutline != null) {
            return _LampsOutline!!
        }
        _LampsOutline = ImageVector.Builder(
            name = "LampsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 4f)
                lineTo(9.35f, 7f)
                horizontalLineTo(4.65f)
                lineTo(5.5f, 4f)
                horizontalLineTo(8.5f)
                moveTo(10f, 2f)
                horizontalLineTo(4f)
                lineTo(2f, 9f)
                horizontalLineTo(12f)
                lineTo(10f, 2f)
                moveTo(6f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                moveTo(18.5f, 10f)
                lineTo(19.35f, 13f)
                horizontalLineTo(14.65f)
                lineTo(15.5f, 10f)
                horizontalLineTo(18.5f)
                moveTo(20f, 8f)
                horizontalLineTo(14f)
                lineTo(12f, 15f)
                horizontalLineTo(22f)
                lineTo(20f, 8f)
                moveTo(16f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _LampsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LampsOutline: ImageVector? = null
