package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Motorbike: ImageVector
    get() {
        if (_Motorbike != null) {
            return _Motorbike!!
        }
        _Motorbike = ImageVector.Builder(
            name = "Motorbike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.42f, 10f)
                lineTo(13.41f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(12.59f)
                lineTo(14.59f, 10f)
                horizontalLineTo(6.5f)
                curveTo(4f, 10f, 2f, 12f, 2f, 14.5f)
                curveTo(2f, 17f, 4f, 19f, 6.5f, 19f)
                curveTo(8.72f, 19f, 10.56f, 17.38f, 10.92f, 15.27f)
                lineTo(13.04f, 14f)
                curveTo(13f, 14.17f, 13f, 14.33f, 13f, 14.5f)
                curveTo(13f, 17f, 15f, 19f, 17.5f, 19f)
                curveTo(20f, 19f, 22f, 17f, 22f, 14.5f)
                curveTo(22f, 12f, 20f, 10f, 17.5f, 10f)
                moveTo(8.84f, 15.26f)
                curveTo(8.5f, 16.27f, 7.58f, 17f, 6.47f, 17f)
                curveTo(5.09f, 17f, 3.97f, 15.88f, 3.97f, 14.5f)
                curveTo(3.97f, 13.12f, 5.09f, 12f, 6.47f, 12f)
                curveTo(7.59f, 12f, 8.5f, 12.74f, 8.84f, 13.75f)
                horizontalLineTo(6f)
                verticalLineTo(15.25f)
                lineTo(8.84f, 15.26f)
                moveTo(17.47f, 17f)
                curveTo(16.09f, 17f, 14.97f, 15.88f, 14.97f, 14.5f)
                curveTo(14.97f, 13.12f, 16.09f, 12f, 17.47f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.97f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.47f, 17f)
                close()
            }
        }.build()

        return _Motorbike!!
    }

@Suppress("ObjectPropertyName")
private var _Motorbike: ImageVector? = null
