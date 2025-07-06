package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DomainRemove: ImageVector
    get() {
        if (_DomainRemove != null) {
            return _DomainRemove!!
        }
        _DomainRemove = ImageVector.Builder(
            name = "DomainRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(13.35f)
                arcTo(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(13.35f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15.69f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                arcTo(5.58f, 5.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13.81f)
                verticalLineTo(7f)
                moveTo(6f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(6f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                moveTo(10f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                moveTo(10f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                moveTo(16f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(16f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(16f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.46f, 21.12f)
                lineTo(17.59f, 19f)
                lineTo(15.46f, 16.88f)
                lineTo(16.88f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }.build()

        return _DomainRemove!!
    }

@Suppress("ObjectPropertyName")
private var _DomainRemove: ImageVector? = null
