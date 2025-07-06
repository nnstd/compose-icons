package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountReactivateOutline: ImageVector
    get() {
        if (_AccountReactivateOutline != null) {
            return _AccountReactivateOutline!!
        }
        _AccountReactivateOutline = ImageVector.Builder(
            name = "AccountReactivateOutline",
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
                moveTo(12f, 20f)
                curveTo(13.9f, 20f, 15.64f, 19.34f, 17f, 18.24f)
                curveTo(16.36f, 17.23f, 14.45f, 16.5f, 12f, 16.5f)
                curveTo(9.55f, 16.5f, 7.64f, 17.23f, 7f, 18.24f)
                curveTo(8.36f, 19.34f, 10.1f, 20f, 12f, 20f)
                moveTo(12f, 6f)
                curveTo(13.93f, 6f, 15.5f, 7.57f, 15.5f, 9.5f)
                curveTo(15.5f, 11.43f, 13.93f, 13f, 12f, 13f)
                curveTo(10.07f, 13f, 8.5f, 11.43f, 8.5f, 9.5f)
                curveTo(8.5f, 7.57f, 10.07f, 6f, 12f, 6f)
                moveTo(12f, 8f)
                curveTo(11.17f, 8f, 10.5f, 8.67f, 10.5f, 9.5f)
                curveTo(10.5f, 10.33f, 11.17f, 11f, 12f, 11f)
                curveTo(12.83f, 11f, 13.5f, 10.33f, 13.5f, 9.5f)
                curveTo(13.5f, 8.67f, 12.83f, 8f, 12f, 8f)
                close()
            }
        }.build()

        return _AccountReactivateOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountReactivateOutline: ImageVector? = null
