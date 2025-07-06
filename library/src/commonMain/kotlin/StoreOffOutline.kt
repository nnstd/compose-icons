package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreOffOutline: ImageVector
    get() {
        if (_StoreOffOutline != null) {
            return _StoreOffOutline!!
        }
        _StoreOffOutline = ImageVector.Builder(
            name = "StoreOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.11f, 7f)
                horizontalLineTo(4f)
                lineTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(15.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.64f, 9f)
                horizontalLineTo(7.11f)
                lineTo(10.11f, 12f)
                horizontalLineTo(5.04f)
                lineTo(5.64f, 9f)
                moveTo(12f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                moveTo(18f, 14.8f)
                verticalLineTo(14f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12f)
                horizontalLineTo(18.96f)
                lineTo(18.36f, 9f)
                horizontalLineTo(12.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(20f)
                lineTo(21f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(16.8f)
                lineTo(18f, 14.8f)
                moveTo(9.2f, 6f)
                lineTo(7.2f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                close()
            }
        }.build()

        return _StoreOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreOffOutline: ImageVector? = null
