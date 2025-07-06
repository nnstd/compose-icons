package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreSettings: ImageVector
    get() {
        if (_StoreSettings != null) {
            return _StoreSettings!!
        }
        _StoreSettings = ImageVector.Builder(
            name = "StoreSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(21f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                horizontalLineTo(20f)
                lineTo(21f, 12f)
                moveTo(12f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _StoreSettings!!
    }

@Suppress("ObjectPropertyName")
private var _StoreSettings: ImageVector? = null
