package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreAlert: ImageVector
    get() {
        if (_StoreAlert != null) {
            return _StoreAlert!!
        }
        _StoreAlert = ImageVector.Builder(
            name = "StoreAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                lineTo(1f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                lineTo(18f, 7f)
                horizontalLineTo(2f)
                moveTo(10f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                moveTo(18f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                moveTo(23f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                moveTo(21f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _StoreAlert!!
    }

@Suppress("ObjectPropertyName")
private var _StoreAlert: ImageVector? = null
