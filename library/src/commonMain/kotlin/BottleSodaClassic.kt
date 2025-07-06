package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleSodaClassic: ImageVector
    get() {
        if (_BottleSodaClassic != null) {
            return _BottleSodaClassic!!
        }
        _BottleSodaClassic = ImageVector.Builder(
            name = "BottleSodaClassic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13.77f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 18.23f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 22f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20f)
                verticalLineTo(18.23f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13.77f)
                verticalLineTo(9f)
                arcTo(12.28f, 12.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.91f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(13.09f)
                arcTo(12.28f, 12.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 9f)
                close()
            }
        }.build()

        return _BottleSodaClassic!!
    }

@Suppress("ObjectPropertyName")
private var _BottleSodaClassic: ImageVector? = null
