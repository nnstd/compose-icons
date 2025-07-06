package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BikePedalClipless: ImageVector
    get() {
        if (_BikePedalClipless != null) {
            return _BikePedalClipless!!
        }
        _BikePedalClipless = ImageVector.Builder(
            name = "BikePedalClipless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.43f, 16.11f)
                lineTo(15.28f, 14f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(15.28f)
                lineTo(14.43f, 7.89f)
                curveTo(14f, 6.75f, 12.87f, 6f, 11.65f, 6f)
                horizontalLineTo(9.35f)
                curveTo(8.13f, 6f, 7f, 6.75f, 6.57f, 7.89f)
                lineTo(5.37f, 10.89f)
                curveTo(5.08f, 11.6f, 5.08f, 12.4f, 5.37f, 13.11f)
                lineTo(6.57f, 16.11f)
                curveTo(7f, 17.25f, 8.13f, 18f, 9.35f, 18f)
                horizontalLineTo(11.65f)
                curveTo(12.87f, 18f, 14f, 17.25f, 14.43f, 16.11f)
                moveTo(9.35f, 8f)
                horizontalLineTo(11.65f)
                curveTo(12.06f, 8f, 12.42f, 8.25f, 12.57f, 8.63f)
                lineTo(13.12f, 10f)
                horizontalLineTo(7.88f)
                lineTo(8.43f, 8.63f)
                curveTo(8.58f, 8.25f, 8.95f, 8f, 9.35f, 8f)
                moveTo(8.43f, 15.37f)
                lineTo(7.88f, 14f)
                horizontalLineTo(13.12f)
                lineTo(12.57f, 15.37f)
                curveTo(12.42f, 15.75f, 12.05f, 16f, 11.65f, 16f)
                horizontalLineTo(9.35f)
                curveTo(8.95f, 16f, 8.58f, 15.75f, 8.43f, 15.37f)
                close()
            }
        }.build()

        return _BikePedalClipless!!
    }

@Suppress("ObjectPropertyName")
private var _BikePedalClipless: ImageVector? = null
