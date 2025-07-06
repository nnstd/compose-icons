package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountReactivate: ImageVector
    get() {
        if (_AccountReactivate != null) {
            return _AccountReactivate!!
        }
        _AccountReactivate = ImageVector.Builder(
            name = "AccountReactivate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 9f)
                horizontalLineTo(16.5f)
                lineTo(18.36f, 7.14f)
                curveTo(16.9f, 5.23f, 14.59f, 4f, 12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                curveTo(4f, 13.83f, 4.61f, 15.5f, 5.64f, 16.85f)
                curveTo(6.86f, 15.45f, 9.15f, 14.5f, 12f, 14.5f)
                curveTo(14.85f, 14.5f, 17.15f, 15.45f, 18.36f, 16.85f)
                curveTo(19.39f, 15.5f, 20f, 13.83f, 20f, 12f)
                horizontalLineTo(22f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(15.14f, 2f, 17.95f, 3.45f, 19.78f, 5.72f)
                lineTo(21.5f, 4f)
                verticalLineTo(9f)
                moveTo(12f, 7f)
                curveTo(13.66f, 7f, 15f, 8.34f, 15f, 10f)
                curveTo(15f, 11.66f, 13.66f, 13f, 12f, 13f)
                curveTo(10.34f, 13f, 9f, 11.66f, 9f, 10f)
                curveTo(9f, 8.34f, 10.34f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _AccountReactivate!!
    }

@Suppress("ObjectPropertyName")
private var _AccountReactivate: ImageVector? = null
