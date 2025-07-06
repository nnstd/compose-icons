package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GiftOffOutline: ImageVector
    get() {
        if (_GiftOffOutline != null) {
            return _GiftOffOutline!!
        }
        _GiftOffOutline = ImageVector.Builder(
            name = "GiftOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                horizontalLineTo(17.83f)
                curveTo(17.94f, 5.69f, 18f, 5.35f, 18f, 5f)
                curveTo(18f, 3.34f, 16.66f, 2f, 15f, 2f)
                curveTo(14f, 2f, 13.12f, 2.5f, 12.57f, 3.24f)
                verticalLineTo(3.23f)
                lineTo(12f, 4f)
                lineTo(11.43f, 3.23f)
                verticalLineTo(3.24f)
                curveTo(10.88f, 2.5f, 10f, 2f, 9f, 2f)
                curveTo(7.97f, 2f, 7.06f, 2.5f, 6.5f, 3.32f)
                lineTo(8.03f, 4.83f)
                curveTo(8.12f, 4.36f, 8.5f, 4f, 9f, 4f)
                curveTo(9.55f, 4f, 10f, 4.45f, 10f, 5f)
                curveTo(10f, 5.5f, 9.64f, 5.88f, 9.17f, 5.97f)
                lineTo(13f, 9.8f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(13.2f)
                lineTo(15.2f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(16.8f)
                lineTo(22f, 18.8f)
                verticalLineTo(12f)
                curveTo(22.55f, 12f, 23f, 11.55f, 23f, 11f)
                verticalLineTo(8f)
                curveTo(23f, 6.9f, 22.11f, 6f, 21f, 6f)
                moveTo(15f, 6f)
                curveTo(14.45f, 6f, 14f, 5.55f, 14f, 5f)
                reflectiveCurveTo(14.45f, 4f, 15f, 4f)
                reflectiveCurveTo(16f, 4.45f, 16f, 5f)
                reflectiveCurveTo(15.55f, 6f, 15f, 6f)
                moveTo(1.11f, 3f)
                lineTo(4.11f, 6f)
                horizontalLineTo(3f)
                curveTo(1.9f, 6f, 1f, 6.9f, 1f, 8f)
                verticalLineTo(11f)
                curveTo(1f, 11.55f, 1.45f, 12f, 2f, 12f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(20.03f, 22f, 20.07f, 22f, 20.1f, 22f)
                lineTo(21.56f, 23.45f)
                lineTo(22.83f, 22.18f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                moveTo(13f, 14.89f)
                lineTo(18.11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(14.89f)
                moveTo(11f, 12.89f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(10.11f)
                lineTo(11f, 12.89f)
                moveTo(8.11f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(6.11f)
                lineTo(8.11f, 10f)
                close()
            }
        }.build()

        return _GiftOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GiftOffOutline: ImageVector? = null
