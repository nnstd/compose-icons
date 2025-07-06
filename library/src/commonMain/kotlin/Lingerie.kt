package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lingerie: ImageVector
    get() {
        if (_Lingerie != null) {
            return _Lingerie!!
        }
        _Lingerie = ImageVector.Builder(
            name = "Lingerie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(4.34f)
                lineTo(12f, 6.91f)
                lineTo(6f, 4.34f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(4.05f)
                curveTo(4.3f, 11.25f, 6.19f, 13f, 8.5f, 13f)
                curveTo(9.92f, 13f, 11.18f, 12.33f, 12f, 11.3f)
                curveTo(12.83f, 12.33f, 14.08f, 13f, 15.5f, 13f)
                curveTo(17.81f, 13f, 19.7f, 11.25f, 19.95f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                moveTo(8.5f, 11f)
                curveTo(7.12f, 11f, 6f, 9.88f, 6f, 8.5f)
                verticalLineTo(6.5f)
                lineTo(11f, 8.65f)
                curveTo(10.9f, 9.96f, 9.83f, 11f, 8.5f, 11f)
                moveTo(18f, 8.5f)
                curveTo(18f, 9.88f, 16.88f, 11f, 15.5f, 11f)
                curveTo(14.17f, 11f, 13.1f, 9.96f, 13f, 8.65f)
                lineTo(18f, 6.5f)
                verticalLineTo(8.5f)
                moveTo(2f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                curveTo(5.97f, 17f, 8.43f, 19.17f, 8.91f, 22f)
                horizontalLineTo(15.09f)
                curveTo(15.57f, 19.17f, 18.03f, 17f, 21f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                moveTo(13.59f, 20f)
                horizontalLineTo(10.41f)
                curveTo(9.94f, 18.84f, 9.21f, 17.82f, 8.29f, 17f)
                horizontalLineTo(15.71f)
                curveTo(14.79f, 17.82f, 14.06f, 18.84f, 13.59f, 20f)
                close()
            }
        }.build()

        return _Lingerie!!
    }

@Suppress("ObjectPropertyName")
private var _Lingerie: ImageVector? = null
