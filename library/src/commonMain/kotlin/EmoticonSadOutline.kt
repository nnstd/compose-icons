package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonSadOutline: ImageVector
    get() {
        if (_EmoticonSadOutline != null) {
            return _EmoticonSadOutline!!
        }
        _EmoticonSadOutline = ImageVector.Builder(
            name = "EmoticonSadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(15.5f, 8f)
                curveTo(16.3f, 8f, 17f, 8.7f, 17f, 9.5f)
                curveTo(17f, 10.3f, 16.3f, 11f, 15.5f, 11f)
                curveTo(14.7f, 11f, 14f, 10.3f, 14f, 9.5f)
                curveTo(14f, 8.7f, 14.7f, 8f, 15.5f, 8f)
                moveTo(10f, 9.5f)
                curveTo(10f, 10.3f, 9.3f, 11f, 8.5f, 11f)
                curveTo(7.7f, 11f, 7f, 10.3f, 7f, 9.5f)
                curveTo(7f, 8.7f, 7.7f, 8f, 8.5f, 8f)
                curveTo(9.3f, 8f, 10f, 8.7f, 10f, 9.5f)
                moveTo(12f, 14f)
                curveTo(13.75f, 14f, 15.29f, 14.72f, 16.19f, 15.81f)
                lineTo(14.77f, 17.23f)
                curveTo(14.32f, 16.5f, 13.25f, 16f, 12f, 16f)
                curveTo(10.75f, 16f, 9.68f, 16.5f, 9.23f, 17.23f)
                lineTo(7.81f, 15.81f)
                curveTo(8.71f, 14.72f, 10.25f, 14f, 12f, 14f)
                close()
            }
        }.build()

        return _EmoticonSadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonSadOutline: ImageVector? = null
