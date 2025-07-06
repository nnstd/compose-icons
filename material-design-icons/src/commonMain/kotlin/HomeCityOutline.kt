package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeCityOutline: ImageVector
    get() {
        if (_HomeCityOutline != null) {
            return _HomeCityOutline!!
        }
        _HomeCityOutline = ImageVector.Builder(
            name = "HomeCityOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                verticalLineTo(4.26f)
                lineTo(12f, 5.59f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(24f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                moveTo(7.5f, 5f)
                lineTo(0f, 10f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                lineTo(7.5f, 5f)
                moveTo(14f, 6f)
                verticalLineTo(6.93f)
                lineTo(15.61f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(18f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                moveTo(7.5f, 7.5f)
                lineTo(13f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                lineTo(7.5f, 7.5f)
                moveTo(18f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                moveTo(18f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _HomeCityOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeCityOutline: ImageVector? = null
